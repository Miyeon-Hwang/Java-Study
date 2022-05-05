package polymorphismUsage;

public class Buyer {
	
	private int money = 1000;
	private int bonusPoint = 0;
	
	// 매개변수를 Product로 받음으로써 이를 상속하는 자손클래스를 매개변수로 다 받을 수 있음. 다형성이 없으면 자손클래스 별로 buy 함수를 작성해주어야함
	// 다형성 장점 => 코드의 재사용. 낮은 결합도. 유지보수 편리
	public void buy(Product p) {
		if (this.money >= p.price) {
			this.money -= p.price;
			this.bonusPoint += (int)(p.price/10);
			System.out.println(p.price + "원으로 구매 완료");
		}
		else {
			System.out.println("잔액 부족으로 구매 실패");
		}

	}
	
	public void info() {
		System.out.println("남은 돈 : " + this.money);
		System.out.println("보너스 포인트 : " + this.bonusPoint);
	}

}

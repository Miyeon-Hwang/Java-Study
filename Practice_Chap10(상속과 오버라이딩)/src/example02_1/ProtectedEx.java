package example02_1;

import example02.HardDisk;

class USBMemory extends HardDisk{
	
	@Override
	public void status() {
		super.status();
		System.out.println(this.name); // 다른 패키지, 자식클래스 내 o -> protected 멤버 변수 접근 가능
		//System.out.println(this.capacity); // default 접근 제어자는 무조건 같은 패키지에서만 접근할 수 있음.
	}
	
}

class ProtectedEx{
	
	public static void main(String[] args) {
		HardDisk hd = new HardDisk();
		//System.out.println(hd.name); // 다른 패키지. 상속 x -> protected 멤버 변수 접근 불가
		//System.out.println(hd.capacity); // 다른패키지이므로 default 멤버 변수 접근 불가
		
		USBMemory usb = new USBMemory();
		//System.out.println(usb.name); // 자식클래스일지라도 protected 멤버변수는 클래스 내부에서만 접근할 수 있음.
	}

}



package example02;

public class HddEx {
	public static void main(String[] args) {
		
		HardDisk hd = new HardDisk(1000, 1);
		USBMemory usb = new USBMemory(2000, 2, 1);
		
		hd.status();
		usb.status();
		usb.status(1);
		
		hd.remove();
		usb.remove();
		
		hd.status();
		usb.status();
		
		System.out.println(hd.name); // 같은 패키지, 상속 x -> protected 멤버변수 접근 가능
	}

}

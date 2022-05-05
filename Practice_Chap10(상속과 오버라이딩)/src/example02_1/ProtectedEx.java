package example02_1;

import example02.HardDisk;

class USBMemory extends HardDisk{
	
	@Override
	public void status() {
		super.status();
		System.out.println(this.name); // �ٸ� ��Ű��, �ڽ�Ŭ���� �� o -> protected ��� ���� ���� ����
		//System.out.println(this.capacity); // default ���� �����ڴ� ������ ���� ��Ű�������� ������ �� ����.
	}
	
}

class ProtectedEx{
	
	public static void main(String[] args) {
		HardDisk hd = new HardDisk();
		//System.out.println(hd.name); // �ٸ� ��Ű��. ��� x -> protected ��� ���� ���� �Ұ�
		//System.out.println(hd.capacity); // �ٸ���Ű���̹Ƿ� default ��� ���� ���� �Ұ�
		
		USBMemory usb = new USBMemory();
		//System.out.println(usb.name); // �ڽ�Ŭ���������� protected ��������� Ŭ���� ���ο����� ������ �� ����.
	}

}



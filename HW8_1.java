class Figure{
	protected double perimeter;	//�ѷ�����
	protected double area;	//����
	public Figure(){} //���⿡�� ����Ʈ �����ڴ� �ƹ� �ϵ� ���� ����
	public Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	//(Object Ŭ������)toString�޼��� ������
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n", this.getClass().getName(), perimeter, area); //this.getClass().getName()
	}
}

class Circle extends Figure{
	protected double radius;
	public Circle(){ //����Ʈ �����ڴ� ����ֵ� ������ ���⿡�� �������� 1�� �� �����ϰ� �ۼ�
		this(1);
	}
	public Circle(double r){	//�������� ���ڷ� �޾� ������, ����, �ѷ����� �ʵ� �ʱ�ȭ
		super(Math.PI*2*r, Math.PI*r*r);
		this.radius = r;
	}
	public String toString(){	//toString�޼��� ������
		return super.toString()+"��, �������� "+radius+"�Դϴ�.\n";		
	} 
	public boolean equals(Object o){
		return this.radius ==((Circle)o).radius;
	}
}

class EquilateralTriangle extends Figure{//���� ����.
	protected double side;
	protected double height;
	EquilateralTriangle(){ //���� ���������� ����Ʈ �����ڴ� �Ѻ��� ���̰� 1�� ���ﰢ�� ����
		this(1);
	}
	EquilateralTriangle(double s){ //�Ѻ��� ���̰�  s�� ���ﰢ�� ����
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n", super.toString(),side, height);		
	} 
}

class HW8_1{
	public static void main(String args []){
		Circle c = new Circle(3);	
		System.out.println(c);	
		EquilateralTriangle r = new EquilateralTriangle(3);	
		System.out.println(r);
	}	
}

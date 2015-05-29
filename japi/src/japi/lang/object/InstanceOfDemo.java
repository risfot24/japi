package japi.lang.object;

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Ambulance amblulance = new Ambulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
		
	}
	
	
	//자동으로 형변환
	public void doWork(Car c){//아직 인스턴스로 생성이 되지 않은!!
		/*
		 c가 FireCar 타입인지 확인후
		 맞다면 (FireCar) 로 객체 캐스팅하라
		
		
		* */
		if(c instanceof FireCar){   //캐스팅할때 에러가 발생하지않게?
			
			FireCar f = (FireCar) c; //원래 코딩
			f.driver();               //강제적으로 타입을 변환시켜서 fireCar라는 것을 인식 시켜주는것이다.
			f.stop();
			f.shootWater();
			/*
			 파라미터로 넘어온 C가 Ambulance 타입인지 확인후
			 맞다면 (Ambulance) 로 객체 캐스팅하라
			
			
			* */
			
			
		}else if(c instanceof Ambulance){
			Ambulance a = (Ambulance) c;
			a.driver();
			a.siren();
			a.stop();
			
		}
		
	}

}

class Car{
	String color;
	int door;
	void driver(){System.out.println("운전중..");}
	void stop(){System.out.println("스톱 !!");}
	
}

class FireCar extends Car{
	void shootWater(){
		System.out.println("물뿌려 불끄는중...");
	}
}
class Ambulance extends Car{
	void siren(){
		System.out.println("사이렌을 울리고 가는중....");
	}
}
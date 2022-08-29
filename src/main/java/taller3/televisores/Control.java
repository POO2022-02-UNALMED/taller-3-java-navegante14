package taller3.televisores;
public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	
	//metodo para cambiar el estado
	public void turnOn() {
		this.tv.estado=true;
	}
	public void turnOff() {
		this.tv.estado=false;		
	}
	
	//metodos para cambiar canales
	public void canalUp() {
		if (this.tv.canal>1 && this.tv.canal<120 && this.tv.estado==true) {
			this.tv.canal++;
		}
			
	}
	public void canalDown() {
		if (this.tv.canal>1 && this.tv.canal<120 && this.tv.estado==true) {
			this.tv.canal--;
		}
	}
	
	//metodos para subir/bajar volumen
	public void volumenUp() {
		if (this.tv.volumen>0 && this.tv.volumen<7 && this.tv.estado==true) {
			this.tv.volumen++;
		}
		
	}
	public void volumenDown() {
		if (this.tv.volumen>0 && this.tv.volumen<7 && this.tv.estado==true) {
			this.tv.volumen--;
		}
	}
	//establecer canal
	public void setCanal(int canal) {
		if (canal>1 && canal<120 && this.tv.estado==true) {
			this.tv.canal=canal;
		}	
	}
	//tv
	public TV getTv () {
		return tv;		
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
	public static void main(String[] args) {
		Marca marca1=new Marca("samsung");
		TV tv1=new TV(marca1,true);
		
		Control control1=new Control();
		
		tv1.setControl(control1);
		control1.enlazar(tv1);
		
		control1.setCanal(8);
		control1.setCanal(9);
		
		System.out.println(tv1.canal);
		System.out.println(control1.tv.canal);
		
	}
}

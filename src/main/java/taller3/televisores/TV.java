package taller3.televisores;

public class TV {
	public Marca marca;
	public int canal=1;
	public int precio=500;
	public boolean estado;
	public int volumen=1;
    Control control;
	
	public static int numTV=0;
	
	public TV (Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	//numTV
	public int getNumTV () {
		return numTV;		
	}
	//Marca
	public Marca getMarca () {
		return marca;		
	}
	public void setMarca(Marca marca) {
		this.marca = marca;	
	}
	//Control
	public Control getControl () {
		return control;		
	}
	public void setControl(Control control) {
		this.control = control;	
	}
	//Precio
	public int getPrecio () {
		return precio;		
	}
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	//volumen
	public int getVolumen () {
		return volumen;		
	}
	public void setVolumen(int volumen) {
		if (this.volumen>0 && this.volumen<7 && this.estado==true) {
			this.volumen = volumen;
		}
	}
	//canal
	public int getCanal () {
		return canal;		
	}
	public void setCanal(int canal) {
		if (canal>1 && canal<120 && this.estado==true) {
			this.canal=canal;
		}	
	}
	//metodo para cambiar el estado
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado () {
		return estado;		
	}
	//metodos para cambiar canales
	public void canalUp() {
		if (this.canal>1 && this.canal<120 && this.estado==true) {
			this.canal++;
		}
	}
	public void canalDown() {
		if (this.canal>1 && this.canal<120 && this.estado==true) {
			this.canal--;
		}
	}
	//metodos para subir/bajar volumen
	public void volumenUp() {
		if (this.volumen>0 && this.volumen<7 && this.estado==true) {
			this.volumen++;
		}
	}
	public void volumenDown() {
		if (this.volumen>0 && this.volumen<7 && this.estado==true) {
			this.volumen--;
		}
	}
	
		

}
	

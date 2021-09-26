package pe.edu.upc.resource;


import java.sql.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
public class UbicacionResource {


	private String latitud;
    private String longitud;
    private Date fecha;
   
    
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}


	
}

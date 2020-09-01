package Modelo;

import java.time.LocalDate;

public class Contrato {
    
    private LocalDate fechaInicial,fechaFinal;
    private String estado;
    private int idContrato;
    private Inquilino inquilino;
    private Inmueble inmueble;
    
    public void setFechaInicial(LocalDate fechaInicial){this.fechaInicial=fechaInicial;}
    public void setFechaFinal(LocalDate fechaFinal){this.fechaFinal=fechaFinal;}
    public void setEstado(String estado){this.estado=estado;}
    public void setIdContrato(int idContrato){this.idContrato=idContrato;}
    public void setInquilino(Inquilino inquilino){this.inquilino=inquilino;}
    public void setInmueble(Inmueble inmuble){this.inmueble=inmuble;}
    
    public LocalDate getFechaInicial(){return fechaInicial;}
    public LocalDate getFechaFinal(){return fechaFinal;}
    public String getEstado(){return estado;}
    public int getIdContrato(){return idContrato;}
    public Inquilino getInquilino(){return inquilino;}
    public Inmueble getInmueble(){return inmueble;}
    
    public Contrato(){}
    
    public Contrato(LocalDate fechaInicial,LocalDate fechaFinal,String estado,int idContrato,Inquilino inquilino,Inmueble inmueble)
    {
        this.fechaInicial=fechaInicial;
        this.fechaFinal=fechaFinal;
        this.estado=estado;
        this.idContrato=idContrato;
        this.inmueble=inmueble;
        this.inquilino=inquilino;
    }
    
    
    
    
}

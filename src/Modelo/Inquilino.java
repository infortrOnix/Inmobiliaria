package Modelo;



public class Inquilino {
    int cuilInquilino,dniGarante;
    String nombre,apellido,lugarTrabajo,nombreGarante;
    
    public void setCuilInquilino(int cuilInquilino){this.cuilInquilino=cuilInquilino;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellido (String apellido){this.apellido=apellido;}
    public void setLugarTrabajo (String lugarTrabajo){this.lugarTrabajo=lugarTrabajo;}      
    public void setNombreGarante (String nombreGarante){this.nombreGarante=nombreGarante;}
    public void setDniGarante (int dniGarante){this.dniGarante=dniGarante;}
    
    public int getCuilInquilino (){return cuilInquilino;}
    public String getNombre (){return nombre;}
    public String getApellido (){return apellido;}
    public String getLugarTrabajo (){return lugarTrabajo;}
    public String getNombreGarante (){return nombreGarante;}
    public int getDniGarante (){return dniGarante;}
    
    public Inquilino(){}
    
    public Inquilino(int cuilInquilino,String nombre,String apellido,String lugarTrabajo,String nombreGarante,int dniGarante )
    {
        this.cuilInquilino=cuilInquilino;
        this.nombre=nombre;
        this.apellido=apellido;
        this.lugarTrabajo=lugarTrabajo;
        this.nombreGarante=nombreGarante;
        this.dniGarante=dniGarante;
    }
    
}

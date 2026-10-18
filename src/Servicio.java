public class Servicio {

    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public void setNombre(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public String getNombre(){
        return nombre;
    }

    public void setPuerto(int puerto){
        if (puerto > 0 ){
            this.puerto = puerto;
        }
    }

    public int getPuerto(){
        return puerto;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public boolean getActivo(){
        return activo;
    }

    public void setCantidadPeticiones(int cantidadPeticiones){
        if (cantidadPeticiones >= 0){
            this.cantidadPeticiones = cantidadPeticiones;
        }
    }

    public int getCantidadPeticiones(){
        return cantidadPeticiones;
    }

    public void iniciar(){
        activo = true;
    }

    public void detener(){
        activo = false;
    }

    public void registrarPeticion(){
        if (activo == true){
            cantidadPeticiones = cantidadPeticiones + 1;
        }
    }



}

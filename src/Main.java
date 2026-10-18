//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Servicio servicio1 = new Servicio();

    servicio1.setNombre("Arreglar");
    servicio1.setPuerto(10);
    servicio1.setCantidadPeticiones(20);
    servicio1.setActivo(true);
    servicio1.registrarPeticion();

    System.out.println(servicio1.getNombre());
    System.out.println(servicio1.getPuerto());
    System.out.println(servicio1.getCantidadPeticiones());
    System.out.println(servicio1.getActivo());




}

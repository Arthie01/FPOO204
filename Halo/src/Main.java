public class Main {
    
    public static void main(String[] args) {
        //Creamos objeto = instanciar objeto;
        Spartan jefeMaestro = new Spartan("jefe Maestro", 100, 100, "Rifle de asalto");
        Spartan reach = new Spartan("Emile", 0, 0, "Escopeta");


    //---------------------------------------------------------------------------------------------------
        //Usar metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacarEnemigo("Grunt");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);
    //---------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println();
        System.out.println();
    //---------------------------------------------------------------------------------------------------
        //Usar metodos
        reach.mostrarInfo();
        reach.atacarEnemigo("Elite");
        reach.recargarArma(30);
        reach.correr(false);
    //---------------------------------------------------------------------------------------------------
    System.out.println();
    System.out.println();


    //Ejemplo de get y set con mi nombre

    jefeMaestro.setNombre("Artemio");
    jefeMaestro.mostrarInfo();
    System.out.println(jefeMaestro.getNombre());
    

    }
}

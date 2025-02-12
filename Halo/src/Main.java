public class Main {
    
    public static void main(String[] args) {
        //Creamos objeto = instanciar objeto;
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();



    //---------------------------------------------------------------------------------------------------
        //Asignamos los atributos del objeto
        jefeMaestro.nombre = "John 117";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal = "Rifle de asalto";
        

        //Usar metodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacarEnemigo("Grunt");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);
    //---------------------------------------------------------------------------------------------------

        System.out.println();
        System.out.println();

    //---------------------------------------------------------------------------------------------------

    //Asignamos los atributos del objeto
 
        reach.nombre = "Jun";
        reach.salud = 100;
        reach.escudo = 100;
        reach.armaPrincipal = "Rifle de precisión";
        

        //Usar metodos
        reach.mostrarInfo();
        reach.atacarEnemigo("Elite");
        reach.recargarArma(30);
        reach.correr(true);

    //---------------------------------------------------------------------------------------------------



    }
}

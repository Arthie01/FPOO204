public class App {
    public static void main(String[] args) throws Exception {
        Generador generador = new Generador(null, false, false);

        String contraeñaGenerada = generador.generador(null, false, false);
        generador.comprobarFortaleza(contraeñaGenerada);

    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Variables
    String resposta = "";
    int correctes = 0;
    int incorrectes = 0;



    Scanner llegir = new Scanner(System.in);

    System.out.println("Indica cuál de las siguientes opciones no es un tipo primitivo de Java:");
    System.out.println("a. int");
    System.out.println("b. char");
    System.out.println("c. boolean");
    System.out.println("d. String");

// Repetir hasta que la entrada sea válida
    while (!resposta.equals("a") && !resposta.equals("b")
            && !resposta.equals("c") && !resposta.equals("d")) {

        resposta = llegir.nextLine().trim().toLowerCase();

        if (!resposta.equals("a") && !resposta.equals("b")
                && !resposta.equals("c") && !resposta.equals("d")) {
            System.out.println("Respuesta no válida. Escribe a, b, c o d.");
        }
    }

    // Comprobar la respuesta
    if (resposta.equals("d")) {
        System.out.println("¡La respuesta es correcta!");
        correctes++;
    } else {
        System.out.println("La respuesta es incorrecta.");
        incorrectes++;
    }
}

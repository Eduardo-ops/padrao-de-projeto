public class Client {

    public static void main(String[] args) {

        // Inicialização de retêngulos
        Rectangle rectangle = new Rectangle();
        Rectangle rectangleTwo = new Rectangle();

        // Inicialização de textos
        Text text = new Text();
        Text textTwo = new Text();

        // Inicialização de linhas
        Line line = new Line();
        Line lineTwo = new Line();

        // Inicialização de dois componentes do gráfico
        Picture graphicOne = new Picture();
        Picture graphicTwo = new Picture();
        Picture graphicThree = new Picture();

        // Criando primeiro gráfico
        graphicOne.add(rectangle); // Adicinando retângulo no gráfico
        graphicOne.add(text); // Adicinando texto no gráfico
        graphicOne.add(line); // Adicionando linha no gráfico

        System.out.println("Componentes do gráfico 1:");
        graphicOne.print();

        // Criando o segundo gráfico
        graphicTwo.add(rectangleTwo);

        System.out.println("Componentes do gráfico 2:");
        graphicTwo.print();

        // Criando o terceiro gráfico
        graphicThree.add(graphicOne);
        graphicThree.add(graphicTwo);

        System.out.println("Componentes do gráfico 3:");
        graphicThree.print();
    }
}

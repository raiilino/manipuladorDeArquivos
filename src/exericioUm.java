import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

void main() {
    // Quero trabalhar com este arquivo
    File arquivo = new File("teste.txt");

    // Verifico se ele já existe
    if(arquivo.exists()) {
        System.out.println("Arquivo já existe");
        // Se não existe...
    } else {
        // Aqui tenho que tentar criar o arquivo
        try {
            if(arquivo.createNewFile()) {
                System.out.println("Criado com sucesso");
            } else {
                System.out.println("Deu ruim!");
            }
            // Se o Windows não deixar eu criar
        } catch (IOException e) {
            System.out.println("Windows não deixou :(");
        }
    }

    // Aqui eu vou tentar escrever no arquivo
    try {
        // Se for com append, ele adiciona ao texto. Sem append, ele sobrescreve
        FileWriter escritor = new FileWriter("teste.txt", true);
        escritor.write("Paulo"); // Frase que estou escrevendo/adicionando ao arquivo
        escritor.close(); // Não esqueça de encerrar a comunicação
        System.out.println("Frase escrita com sucesso!");
        // Se o Windows não deixar eu escrever
    } catch(IOException e) {
        System.out.println("Windows não deixou escrever");
    }
} 
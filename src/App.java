import java.util.*;

public class App {

    static int menu(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Arvore Binária de Busca");
        // System.out.println("1. Inserir elemento");
        System.out.println("1. Inserir aluno");
        System.out.println("2. Remover elemento");
        // System.out.println("3. Buscar elemento");
        System.out.println("3. Buscar aluno");
        System.out.println("4. Exibir árvore");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return leia.nextInt();
    }

    
    public static void main(String[] args) throws Exception {
        
        /*ATIDADE EAD 19/10  
        //Árvore binária de busca para inteiros

        BinarySearchTree<Integer> arvore = new BinarySearchTree<>();

        //Inserção dos elementos

        arvore.add(50);
        arvore.add(30);
        arvore.add(70);
        arvore.add(20);
        arvore.add(40);
        arvore.add(60);
        arvore.add(80);

        //Identificação do percurso e chamada do método preOrdem()

        System.out.println("Percurso preOrder:");
        arvore.preOrder();

        */
        
        
        
        Scanner leia = new Scanner(System.in);
        // BinarySearchTree<Integer> arvore = new BinarySearchTree<>(); // 
        BinarySearchTree<Aluno> arvore = new BinarySearchTree<>(); 
        int opcao=0;
        do {
            System.out.println("----------------------------------");
            opcao = menu();
            switch (opcao) {
                case 1:
                    /* 
                    System.out.print("Digite o elemento a ser inserido: ");
                    Integer elementoInserir = leia.nextInt();
                    arvore.add(elementoInserir); // inserir
                    System.out.println("Elemento inserido com sucesso!");
                    */
                    System.out.print("Digite a matrícula do aluno: ");
                    int matriculaInserir = leia.nextInt();
                    leia.nextLine(); 
                    System.out.print("Digite o nome do aluno: ");
                    String nomeInserir = leia.nextLine();
                    
                    Aluno novoAluno = new Aluno(matriculaInserir, nomeInserir);
                    arvore.add(novoAluno); 
                    System.out.println("Aluno inserido com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o elemento a ser removido: ");
                    Integer elementoRemover = leia.nextInt();
                    
                    System.out.println("Elemento removido com sucesso!");
                    break;
                case 3:
                    /* 
                    System.out.print("Digite o elemento a ser buscado: ");
                    Integer elementoBuscar = leia.nextInt();
                    if(arvore.buscar(elementoBuscar) != null) { // buscar
                        System.out.println("Elemento encontrado!");
                    } else {
                        System.out.println("Elemento não encontrado!");
                    }
                    */
                    System.out.print("Digite a matrícula do aluno a ser buscado: ");
                    int matriculaBuscar = leia.nextInt();
                    Aluno alunoBusca = new Aluno(matriculaBuscar);
                    
                    Aluno alunoEncontrado = arvore.buscar(alunoBusca);
                    if(alunoEncontrado != null) { // buscar
                        System.out.println("Aluno encontrado: " + alunoEncontrado);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Exibindo a árvore em pré-ordem:");
                    arvore.preOrder(); // exibir 
                    System.out.println("Exibindo a árvore em ordem:");
                    arvore.inOrder();
                    System.out.println("Exibindo a árvore em pós-ordem:");
                    //arvore.______________();
                    arvore.postOrder();

                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

        
}
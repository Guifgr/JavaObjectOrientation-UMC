/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplic_persistencia;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author guifg
 */
public class Aplic_persistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();

        while(continuar){
            System.out.println("\nSelecione a opção\n");
            System.out.println("1 Cadastrar produto\n");
            System.out.println("2 Listar produtos\n");
            System.out.println("3 Pesquisar produtos\n");
            System.out.println("4 Sair\n");
            int Opcao = input.nextInt();
            switch(Opcao){
                case 1: System.out.println("Você selecionou cadastrar produto\n");
                        System.out.println("Digite o nome do produto\n");
                        String Descricao = input.next();
                        System.out.println("Digite o valor do produto\n");
                        Double valor = input.nextDouble();
                        produto.cadastrarProduto(Descricao, valor);
                break;
                case 2: System.out.println("Você selecionou Listar produtos\n");
                        produto.ListarProdutos();
                break;
                case 3: System.out.println("Você selecionou pesquisar produtos\n");
                        System.out.println("Digite o nome do produto\n");
                        int id = input.nextInt();
                        produto.pesquisarProduto(id);
                break;
                case 4: System.out.println("Até outra vez <3");
                        continuar = false;
                default: System.out.println("\n Opção invalida \n\n\n");
                
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.arthursiq5.src.criptografia;

/**
 *
 * @author arthur
 */
public class CriptoDecripto {

    public static void main(String[] args) {
        String mensagem = "A vaca tava doida demais";
        String chave = "VACA";

        //================= Criptografa =====================
        Criptografa cr = new Criptografa(mensagem, chave);
        System.out.println("Mensagem critografada:");
        int mensVC[] = cr.critografa();
        cr.imprimeValues();
        System.out.println("Suposta mensagem textual criptografada:");
        String mensCripto = cr.getMensagemCripto();
        System.out.println("{" + mensCripto + "}");
        System.out.println("Checksum's da mensagem original");
        long checksumC1 = cr.getChecksum1();
        String checksumC2 = cr.getChecksum2();
        System.out.println(checksumC1);
        System.out.println(checksumC2);

        //================= Descriptografa ==================
        Descriptografa dr = new Descriptografa(mensCripto, chave);
        System.out.println("Mensagem descritografada:");
        int mensVD[] = dr.descriptografa();
        dr.imprimeValues();
        System.out.println("Suposta mensagem textual criptografada:");
        String mensDescripto = dr.getMensagemDescripto();
        System.out.println("{" + mensDescripto + "}");
        System.out.println("Checksum's da mensagem original");
        long checksumD1 = dr.getChecksum1();
        String checksumD2 = dr.getChecksum2();
        System.out.println(checksumD1);
        System.out.println(checksumD2);

        //================= Força Bruta =====================
        int tamSenha = chave.length(); // só para facilitar um pouco, poderia ser qualquer um
        for (long i = 0; i < 1000000000; i++) {
            String senha = "";
            for (int j = 0; j < tamSenha; j++) {
                senha += (char) (32 + Math.random() * 95); //caracteres imprimíveis                
            }

            Descriptografa d = new Descriptografa(mensCripto, senha);
            int mensD[] = d.descriptografa(); //chama o processo
            if (d.getChecksum1() == checksumC1 && d.getChecksum2().equals(checksumC2)) {
                System.out.println("\n\n----------------------------------- 000ooo000");
                System.out.println("Chave criptográfica quebrada !!!");
                System.out.println("Senha______: " + senha);
                System.out.println("Mensagem___: " + d.getMensagemDescripto());
                break;
            }
        }

    }
}

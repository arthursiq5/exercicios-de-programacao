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
public class Criptografa {

    private String mensagem = null;
    private String chave = null;
    private String mensagemCripto = null;
    private int[] mensagemValue = null;
    private String hash = null;
    private long checksum1 = 0;
    private String checksum2 = null;

    public String getMensagem() {
        return mensagem;
    }

    public String getChave() {
        return chave;
    }

    public String getMensagemCripto() {
        return mensagemCripto;
    }

    public int[] getMensagemValue() {
        return mensagemValue;
    }

    public String getHash() {
        return hash;
    }

    public long getChecksum1() {
        return checksum1;
    }

    public String getChecksum2() {
        return checksum2;
    }

    public Criptografa(String mensagem, String chave) {
        this.mensagem = mensagem;
        this.chave = chave;
    }

    public int[] critografa() {
        long ck2 = 0;
        checksum1 = 0;        
        mensagemValue = new int[mensagem.length()];
        mensagemCripto = "";
        for (int i = 0; i < mensagem.length(); i++) {
            int p = i % chave.length();
            mensagemValue[i] = (mensagem.charAt(i) ^ chave.charAt(p));
            mensagemCripto += (char) mensagemValue[i];
            checksum1 += (mensagem.charAt(i) - 32) * (i + 1);
            ck2 += ck2 + (ck2 << 3) + (mensagem.charAt(i) - 32);
        }
        checksum2 = "" + ck2;
        return mensagemValue;
    }

    public void imprimeValues() {
        System.out.print("{");
        for (int i = 0; i < mensagemValue.length - 1; i++) {
            System.out.print(mensagemValue[i] + ",");
        }
        System.out.println(mensagemValue[mensagemValue.length - 1] + "}");
    }

}

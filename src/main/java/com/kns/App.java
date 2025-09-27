package com.kns;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //URL da página
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a url da página: ");
        String url = input.nextLine();

        try {
            //Dados da página
            Document document = Jsoup.connect(url).get();

            //seletor
            Element precoElement = document.selectFirst("td.data.destaque.w3");
            String preco = precoElement != null ? precoElement.text() : "N/A";

            System.out.println("Preço da ação: "+preco);

            //Outros elementos da tela
            Elements details = document.select(".w728 tbody tr");

            for (Element linha : details) {
                String key = linha.select("td:nth-child(1)").text(); //Nome do campo\
                String value = linha.select("td:nth-child(2)").text(); //Valor
                System.out.println(key+" : "+value);
            }

        } catch (Exception e) {
            System.out.println("Erro na consulta scraping: "+e.getMessage());
        }
        input.close();
    }
}
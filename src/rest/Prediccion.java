/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.IOException;
import modelo.Parametros;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author Luis
 */
public class Prediccion {

    private static String LINK_SERVICIO = "https://go.rapidminer.com/am/api/deployments/";
    private static String TOKEN_RB = "1b5fdfe0-af6f-4fad-a04f-521ea0057b6a";
    private static String TOKEN_AP = "e4480fa0-cfc7-44b4-a261-eb9894f726e1";
    private static String TOKEN_AD = "724e079c-dc2c-4231-9e5a-08363f5afd55";

    public String getToken(int tipo) {
        if (tipo == 0) {
            return TOKEN_RB;
        } else if (tipo == 1) {
            return TOKEN_AP;
        }else if (tipo == 2) {
            return TOKEN_AD;
        }
        return "";
    }

    public String getPrediccion(int tipo, Parametros parametros) throws IOException {
        System.out.println("{\r\n  \"data\": [\r\n    {\r\n      \"sexo\": " + parametros.getSexo() + ",\r\n      \"mes_fall\": " + parametros.getMes_fall() + ",\r\n      \"edad\": " + parametros.getEdad() + ",\r\n      \"prov_res\": " + parametros.getProv_res() + ",\r\n      \"area_res\": " + parametros.getArea_res() + ",\r\n      \"est_civil\": " + parametros.getEst_civil() + ",\r\n      \"niv_inst\": " + parametros.getNiv_inst() + ",\r\n      \"prov_fall\": " + parametros.getProv_fall() + ",\r\n      \"area_fall\": " + parametros.getArea_fall() + ",\r\n      \"lug_viol\": " + parametros.getLug_viol() + ",\r\n      \"autopsia\": " + parametros.getAutopsia() + "\r\n    }\r\n  ]\r\n}");
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\r\n  \"data\": [\r\n    {\r\n      \"sexo\": " + parametros.getSexo() + ",\r\n      \"mes_fall\": " + parametros.getMes_fall() + ",\r\n      \"edad\": " + parametros.getEdad() + ",\r\n      \"prov_res\": " + parametros.getProv_res() + ",\r\n      \"area_res\": " + parametros.getArea_res() + ",\r\n      \"est_civil\": " + parametros.getEst_civil() + ",\r\n      \"niv_inst\": " + parametros.getNiv_inst() + ",\r\n      \"prov_fall\": " + parametros.getProv_fall() + ",\r\n      \"area_fall\": " + parametros.getArea_fall() + ",\r\n      \"lug_viol\": " + parametros.getLug_viol() + ",\r\n      \"autopsia\": " + parametros.getAutopsia() + "\r\n    }\r\n  ]\r\n}");
        Request request = new Request.Builder()
                .url(LINK_SERVICIO + getToken(tipo))
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .addHeader("Cookie", "AWSELB=F5ED6F7B0609F79A8047F0F2CA820A378E37E1B102F8B1EFA5487B339B730E403BEFEC78F6B5D938311EF0082445CAA15DAB516ACAC0377AEDE5DB6C5A1D32B49CFCA20E5B")
                .build();
        Response response = client.newCall(request).execute();
        String resp = response.body().string();
        return resp;
    }

}

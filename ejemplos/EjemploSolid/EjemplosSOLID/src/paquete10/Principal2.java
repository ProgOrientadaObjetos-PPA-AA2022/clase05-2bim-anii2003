/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal2 {
    public static void main(String[] args) {
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp);

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api2=");
        System.out.println(gp2);

        System.out.println("---------------------------");

        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("987456");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api3=");
        System.out.println(gp3);

        System.out.println("---------------------------");

        APIDirectvGo api4 = new APIDirectvGo();
        api4.establecerApiKey("000001");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api4=");
        System.out.println(gp4);

        String nombreArchivo = "Movies.data";
        
        GeneradorPeliculas [] lista = {gp, gp2, gp3, gp4};
        
        EscrituraArchivoSecuencial archivo = new 
            EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

    }

}

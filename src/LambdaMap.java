/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sydra
 */
import java.util.HashMap;


public class LambdaMap {

    public static void main(String[] args) {

        HashMap<String, String> mahasiswa =
                new HashMap<>();

        mahasiswa.put(
                "24060124140154",
                "Syahrafi Ahmad Pradika"
        );

        mahasiswa.put(
                "24060124140155",
                "Budi"
        );


        mahasiswa.forEach(
                (nim, nama) ->
                        System.out.println(
                                nim + " : " + nama
                        )
        );
    }
}
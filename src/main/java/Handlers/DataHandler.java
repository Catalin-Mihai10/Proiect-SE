package Handlers;

import DataTypes.Constants;
import DataTypes.Offers;
import Utilities.Serializer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class DataHandler {

    public static Offers readFromFile(Path path){
        Offers offers;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(String.valueOf(path)))) {
            Serializer serializer = new Serializer();
            offers = serializer.deserializeData(bufferedReader);
        } catch (IOException e) {
            return new Offers();
        }

        return offers;
    }

    public static boolean writeToFile(Path path, Offers offers){
        try( Writer writer = Files.newBufferedWriter(path)){

            Serializer serializer = new Serializer();
            String data = serializer.serializeData(offers);

            writer.write(data);

        } catch (IOException e){
            return Constants.FALSE;
        }

        return Constants.TRUE;
    }

}

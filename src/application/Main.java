package application;
	
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import personel.Personel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import controller.Controller;

public class Main extends Application {
	
	private static Scene scene;
	private static Object personelList;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		scene= new Scene(loadFXML("Giris"));
		primaryStage.setScene(scene);
		primaryStage.setTitle("MAAŞ TAKİP SİSTEMİ");
		primaryStage.setResizable(false);
		primaryStage.show();
		
	}
	
	// parametre olarak gönderilen fxml dosyasını yükleyen metod
	public static Parent loadFXML(String FXML) throws IOException {
		
		FXMLLoader fxmlLoader= new FXMLLoader(Main.class.getResource("/views/"+FXML+".fxml"));
		Parent parent=fxmlLoader.load();
		
		return parent;
	
	}
	
	@Override
	public void stop() throws IOException {
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		launch(args);
		/*
		int a = Controller.personelList.size();
		int i = 0;
		
		while(a>i) {
			Personel aktifPersonel= Controller.personelList.get(i);
			String text="/n" + aktifPersonel.getIsim()+" " + aktifPersonel.getSoyisim()
			+ " " + aktifPersonel.getPozisyon() + " " + aktifPersonel.getYas()
			+ " " + aktifPersonel.getPersonelNo();
			Controller.veriKaydetBTN("eyyup.mydb",text);
			i+=1;
		}
		*/	
	}
	
	public static void saveData(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
            //writer.newLine();
            System.out.println("Veriler başarıyla kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }
    }
	
}

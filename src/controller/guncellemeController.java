package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import personel.Personel;

public class guncellemeController {
	@FXML
	private Button onaylaButon;
	@FXML
	private TextField isimTextField;
	@FXML
	private TextField soyisimTextField;
	@FXML
	private TextField personelNoTextField;
	@FXML
	private TextField pozisyonTextField;
	@FXML
	private TextField yasTextField;
	
	private Personel seciliPersonel;
	
	public void seciliPersonelMetod(Personel personel) {
		seciliPersonel=personel;
	}
	
	@FXML
	public void onaylaButonKod() {
		// TextField'dan alınan değerleri uygun türlere dönüştür
	    long personelNo = Long.parseLong(personelNoTextField.getText());
	    String isim = isimTextField.getText().toUpperCase();
	    String soyisim = soyisimTextField.getText().toUpperCase();
	    String pozisyon = pozisyonTextField.getText().toUpperCase();
	    int yas = Integer.parseInt(yasTextField.getText());
	    
	    
	    seciliPersonel.setIsim(isim);
	    seciliPersonel.setPersonelNo(personelNo);
	    seciliPersonel.setSoyisim(soyisim);
	    seciliPersonel.setPozisyon(pozisyon);
	    seciliPersonel.setYas(yas);
	    
	    // Personel nesnesi oluşturuluyor
	    //Personel yeniPersonel = new Personel(personelNo, isim, soyisim, pozisyon, yas);
	    // observable liste yeni personeli ekle
	    //Controller.personelList.add(yeniPersonel);
	    //Controller controller=new Controller();
	    //controller.tableView.setItems(Controller.personelList);
	    
		// onaylaButon'un bulunduğu stage'i kapat
		Stage kapastage = (Stage) onaylaButon.getScene().getWindow(); // onaylaButon'un bulunduğu stage'i bir nesneye atama
		kapastage.close(); // alınan stage'i kapatma
		
		
	}
}

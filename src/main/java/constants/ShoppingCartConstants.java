package constants;

public interface ShoppingCartConstants {

    String BUTTON_UBAH_KURIR = "//a[text()='Ubah Kurir']";
    String BUTTON_BATAL_POPUP = "//a[contains(text(),'Batal')]";
    String BUTTON_HAPUS_ON_ITEM = "//td[@class='btn cartfont']/a[text()='Hapus']";
    String BUTTON_OK_HAPUS_ON_ITEM = "(//span[@class='btnGray']/a[text()='OK'])[2]";
    String LABEL_EMPTY_CART = "//strong[text()='Tidak ada produk di Shopping Cart.']";
}

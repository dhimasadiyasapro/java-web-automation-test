@smoke
Feature: Alami Web Automation Test

  Scenario: Verify User able to delete item on shopping cart
    Given User go to elevenia homepage
    And User search "komputer"
    And User choose "Produk terlaris" on Sort by
    And User choose the first product on product list
    And User update product quantity to "3"
    And User click button Tambahkan ke Cart
    And User choose "Ya" on lihat keranjang popup
    And User click button Ubah Kurir
    And User click button Batal on Ubah Kurir popup
    When User click button Hapus on item shopping cart
    And User click button OK on hapus produk popup
    Then User do not see deleted produk on shopping cart
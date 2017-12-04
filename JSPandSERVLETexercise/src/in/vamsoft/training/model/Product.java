package in.vamsoft.training.model;

public class Product {
  int productId;
  String productName;

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * @param productId.
   * @param productName.
   */
  public Product(int productId, String productName) {
    super();
    this.productId = productId;
    this.productName = productName;
  }

  public Product() {
    super();

  }
  public String getLangComments() {
    if (productName.equals("book")) {
        return ("Book are select");
    } else if (productName.equals("car")) {
        return ("Car are select");
    } else if (productName.equals("dress")) {
      return ("Dress are select ");
  } else {
      return ("No idea..!");
}
  }
}

public enum Suits {
 HEART("HEART"),
 SPREAD("SPREAD"),
 DIAMOND("DIAMOND"),
 CLUB("CLUB");
 
 private final String value;
 Suits(String value) {
  this.value = value;
 }
 
 public String getValue() {
  return value;
 }
}
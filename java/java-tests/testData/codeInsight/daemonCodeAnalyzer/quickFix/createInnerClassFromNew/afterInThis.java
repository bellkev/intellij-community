// "Create Inner Class 'Generic'" "true"
class Test {
  Test() {
    this (new Generic<String> ());
  }

  Test(String s){}

    private static class Generic<T> {
    }
}
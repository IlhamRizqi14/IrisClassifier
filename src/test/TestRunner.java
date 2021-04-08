package test;

import classifier.Classifier;

public class TestRunner {
    public static void main(String[] args) {
        Classifier classifier = new Classifier();
        
          //test case 1
        System.out.println(classifier.predict(4.3, 3.0, 1.1, 0.1));
        
          //test case 2
        System.out.println(classifier.predict(4.8, 3.0, 1.4, 0.1));
        
          //test case 3
        System.out.println(classifier.predict(5.2, 4.1, 1.5, 0.1));
        
          //test case 4
        System.out.println(classifier.predict(4.6, 3.6, 1.0, 0.2));
        
          //test case 5
        System.out.println(classifier.predict(5.1, 3.3, 1.7, 0.5));
        
          //test case 6
        System.out.println(classifier.predict(5.0, 3.5, 1.6, 0.6));
        
          //test case 7
        System.out.println(classifier.predict(5.0, 2.3, 3.3, 1.0));
        
          //test case 8
        System.out.println(classifier.predict(4.9, 2.4, 3.3, 1.0));
        
          //test case 9
        System.out.println(classifier.predict(5.0, 2.0, 3.5, 1.0));
        
          //test case 10
        System.out.println(classifier.predict(6.1, 2.8, 4.0, 1.3));
        
          //test case 11
        System.out.println(classifier.predict(5.7, 2.8, 4.1, 1.3));
        
          //test case 12
        System.out.println(classifier.predict(5.6, 3.0, 4.1, 1.3));
        
          //test case 13
        System.out.println(classifier.predict(6.1, 2.6, 5.6, 1.4));
        
          //test case 14
        System.out.println(classifier.predict(6.0, 2.2, 5.0, 1.5));
        
          //test case 15
        System.out.println(classifier.predict(6.3, 2.8, 5.1, 1.5));
        
          //test case 16
        System.out.println(classifier.predict(7.2, 3.0, 5.8, 1.6));
        
          //test case 17
        System.out.println(classifier.predict(4.9, 2.5, 4.5, 1.7));
        
          //test case 18
        System.out.println(classifier.predict(6.2, 2.8, 4.8, 1.8));
        
    }
    
}

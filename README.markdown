# Animal shelter in Java
This project is setUp to be able to redo the AnimalShelter redictions with Java. Dependencies for all libraries are added, but you probably just need one.
The goal of this is to do some research to these libraries. Therefore I added some questions to answer. Feel free to add your own questions. And try to document the answers here as well. 


## Working with Mahout
### Questions
1. When and why use Mahout?
2. Advantaged and disadvantages of using Mahout comparing to other libraries (including sklearn)
3. When implementing a model as similar as possible to our Tree model in Python, what are the differences in the performance of the model (precision - recall - f1 score - accuracy)

### Answers
1. Mahout is suitable when working with Big Data. It uses the MapReduce paradigm
2. Fiding how to implement a simple decision tree or a random forest is harder than finding this out for sk-learn in Python. It is hard to start with creating a decision tree, since there are few examples. Random forest has some examples. 

### Useful links
https://www.credera.com/blog/technology-insights/java/mahout-explained-5-minutes-less/
https://www.youtube.com/watch?v=WB9zr0IZCPQ

## Working with Spark MLlib
### Questions
1. When and why use Spark MLlib?
2. Advantaged and disadvantages of using Spark MLlib comparing to other libraries (including sklearn)
3. When implementing a model as similar as possible to our Tree model in Python, what are the differences in the performance of the model (precision - recall - f1 score - accuracy)

### Answers
1. Big data Machine Learning problem. When you want to use a library that can be used in Java, Scala, Python as well as in R. Easy when you are already working with Spark. 
2. Compared to Mahout, it is much easier to find an example of how to implement a decision tree or a random forest. Compared to sklearn, you don't find much additional examples. 
Easy to find example, but harder to find what exactly the parameters are that we need to pass. Hard to find out which values could be default values.

### General findings 
 From the example I found out what some of the parameters mean. So categoricalFeaturesInfo is that for each category that we have, you should map how many possible values there are. OneHotEncoder could be used for this, but I decided to not explore that further. 
 Impurity is for information gain strategy. 
 MaxBins is the maximum number of bins used for splitting features. But at this point I'm not really sure what this actually means. 
Easy to find an example. Hard to recreate that example with own dataset (even when parameters not configurable in code etc.). Hard to understand what exactly is needed and what the parameters mean. 

### Useful links
https://spark.apache.org/docs/2.2.0/ml-classification-regression.html
https://www.infoworld.com/article/3031690/analytics/why-you-should-use-spark-for-machine-learning.html

## Working with Weka
### Questions
1. When and why use Weka?
2. Advantaged and disadvantages of using Weka comparing to other libraries (including sklearn)
3. When implementing a model as similar as possible to our Tree model in Python, what are the differences in the performance of the model (precision - recall - f1 score - accuracy)

### Answers
1. Seems not so great for Big Data. For Java there is an API, also GUI available. 
2. Weka has a GUI (which we used once for preprcessing). This is also suitable for doing classification tasks. Different implementations of trees. A lot of possible implemetation of decision trees. More research necessary to check what the difference is between these algorithmes and what algorithm is used in sk-learn. 
### General findings 
There is much documentation available about using the GUI of weka. Sometimes it is harder to find code examples to be able to implement it in Java. Turned out that weke seems very user friendly, but it took some time to find out how the data should be transformed to instances in the same way. Looking for an easy way to use machine learning in Java, this is definitly a library to explore further. 

### Useful links
https://www.youtube.com/watch?v=TF1yh5PKaqI

## Working with DeepLearning4J
### Questions
1. When and why use DeepLearning4J?
2. Advantaged and disadvantages of using DeepLearning4J comparing to other libraries (like sklearn)?

### Answers
1. Use DeepLearning4J when deep learning is required. Typically deep learning involves multiple layers and a non-linear processing. 
2. Multi-node clustering possible.

## Things I like to explore further
- Exploring more in debt: what is the difference in Hadoop, MapReduce and Mahout
- https://www.youtube.com/watch?v=KzFe4T0PwQ8
- JavaSparkContext
- https://spark.apache.org/
- multi-node clustering possible for other libraries than DeepLearning4J?



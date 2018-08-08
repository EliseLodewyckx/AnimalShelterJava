package be.machinelearning.animalshelter.ml.models.weka;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class WekaModalFactory {


    public void getTrainedModel(String fileNameTrainingSet) throws Exception {

        Instances trainData = getTrainingSet(fileNameTrainingSet);
        trainData.setClassIndex(trainData.numAttributes() - 1);

        J48 tree = new J48();

        String[] options = new String[1];
        options[0] = "-U"; // make an unpruned tree

        tree.setOptions(options);
        tree.buildClassifier(trainData);


        System.out.println(tree.toString());
    }

    public static void main(String[] args) throws Exception {
        new WekaModalFactory().getTrainedModel("./data/train.csv");
    }


    public Instances getTrainingSet(String filename) throws Exception {
        DataSource dataSource = new DataSource(filename);
        Instances instances = dataSource.getDataSet();
        return instances;
    }


}

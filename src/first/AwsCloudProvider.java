package first;

public class AwsCloudProvider implements CloudProvider{
    @Override
    public void uploadBlob(String x) {
        System.out.println("I am calling AWS api and uploading the file to S3");
    }
}

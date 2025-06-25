package first;

public class UploadService {
    CloudProvider cloudProvider;

    public UploadService(CloudProvider cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    public void handleFileUpload(String x) {
        cloudProvider.uploadBlob(x);
    }
}

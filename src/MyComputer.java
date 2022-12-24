public class MyComputer {

    String brand;
    String name = "小新Pro16";
    String operating_system = "Windows 11 家庭中文版22H2";
    String cpu = "AMD R7-5800H";
    String gpu = "GTX1650";
    Boolean is_movable = true;
    String Memory_size = "16+512";
    String resolution = "2560×1600";
    String refresh_rate = "120Hz";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public Boolean getIs_movable() {
        return is_movable;
    }

    public void setIs_movable(Boolean is_movable) {
        this.is_movable = is_movable;
    }

    public String getMemory_size() {
        return Memory_size;
    }

    public void setMemory_size(String memory_size) {
        Memory_size = memory_size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRefresh_rate() {
        return refresh_rate;
    }

    public void setRefresh_rate(String refresh_rate) {
        this.refresh_rate = refresh_rate;
    }


    public  void watch() {
        System.out.println("看视频");
    }

    public void play() {
        System.out.println("打游戏");
    }

    public void work() {
        System.out.println("办公");
    }


}

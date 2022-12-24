public class user {
    public static void main(String[] args) {
        MyComputer PC=new MyComputer();
        PC.setBrand("lenovo");
        System.out.println("品牌："+PC.getBrand());
        System.out.println("名称："+PC.getName());
        System.out.println("操作系统："+PC.getOperating_system());
        System.out.println("CPU："+PC.getCpu());
        System.out.println("显卡："+PC.getGpu());
        System.out.println("是否可移动"+PC.getIs_movable());
        System.out.println("储存："+PC.getMemory_size());
        System.out.println("分辨率："+PC.getResolution());
        System.out.println("刷新率："+PC.getRefresh_rate());


        System.out.println("使用");
        PC.watch();
        PC.play();
        PC.work();
    }
}

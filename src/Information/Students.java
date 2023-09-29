package Information;

public class Students {
    private String id;
    private String name;
    private String college;
    private String major;
    public Students(){}
    public Students(String id, String name, String college, String major) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.major = major;
    }

    public String getId() {
        return id ;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void information_printf() {
        System.out.printf("%-16s%-13s" + "\t" + "%-12s" + "\t" + "%s\n", getId(), getName(), getCollege(), getMajor());
    }
}



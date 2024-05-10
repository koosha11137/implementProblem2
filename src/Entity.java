import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private String code;
    private Integer type;
    private String parentCode;
    private List<Entity> children;

    public Entity(String name, String code, int type, String code1) {
        this.name=name;
        this.code=code;
        this.type=type;
        this.parentCode=code1;
        this.children=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParentCode() {
        return parentCode;
    }

    public List<Entity> getChildren() {
        return children;
    }

    public  void addChild( Entity child) {
        this.children.add(child);
    }
}

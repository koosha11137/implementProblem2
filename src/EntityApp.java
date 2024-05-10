
import java.util.ArrayList;
import java.util.List;

public class EntityApp {
    public static void main(String[] args) {
        Entity root = new Entity("accounting", "ROOT", 1, null);

        // createNode
        createNode(root, "Child1", "accountingAssistance1", 2);
        createNode(root, "Child2", "accountingAssistance2", 3);

        
        System.out.println(getNameToRoot("accountingAssistance1", "/"));

        // getAllChildren
        List<Entity> children = getAllChildren("ROOT");
        for (Entity child : children) {
            System.out.println(child.getName());
        }
    }

    private static void createNode(Entity parent, String code, String name, int type) {
        Entity child = new Entity(name, code, type, parent.getCode());
        parent.addChild(child);
    }


    private static String getNameToRoot(String code, String separator) {
        Entity entity = findEntity(code);
        if (entity != null) {
            StringBuilder path = new StringBuilder();
            while (entity != null) {
                path.insert(0, separator + entity.getName());
                entity = findEntity(entity.getParentCode());
            }
            return path.substring(separator.length());
        } else {
            return null;
        }
    }

    private static List<Entity> getAllChildren(String code) {
        Entity entity = findEntity(code);
        if (entity != null) {
            List<Entity> children = new ArrayList<>();
            getChildren(entity, children);
            return children;
        } else {
            return null;
        }
    }

    private static void getChildren(Entity entity, List<Entity> children) {
        children.add(entity);
        for (Entity child : entity.getChildren()) {
            getChildren(child, children);
        }
    }

    private static Entity findEntity(String code) {
        // implement function to find Entity
        return null;
    }
}

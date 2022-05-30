package com.example.apishirt.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Shirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private int available;
    private String img;
}

//
//
//@Entity
//public class Shirt {
//    @Id
//    @GeneratedValue(
//            strategy = GenerationType.IDENTITY
//    )
//    private int id;
//    private String name;
//    private String description;
//    private int available;
//    private String img;
//
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof Shirt)) {
//            return false;
//        } else {
//            Shirt other = (Shirt)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (this.getId() != other.getId()) {
//                return false;
//            } else if (this.getAvailable() != other.getAvailable()) {
//                return false;
//            } else {
//                label52: {
//                    Object this$name = this.getName();
//                    Object other$name = other.getName();
//                    if (this$name == null) {
//                        if (other$name == null) {
//                            break label52;
//                        }
//                    } else if (this$name.equals(other$name)) {
//                        break label52;
//                    }
//
//                    return false;
//                }
//
//                Object this$description = this.getDescription();
//                Object other$description = other.getDescription();
//                if (this$description == null) {
//                    if (other$description != null) {
//                        return false;
//                    }
//                } else if (!this$description.equals(other$description)) {
//                    return false;
//                }
//
//                Object this$img = this.getImg();
//                Object other$img = other.getImg();
//                if (this$img == null) {
//                    if (other$img != null) {
//                        return false;
//                    }
//                } else if (!this$img.equals(other$img)) {
//                    return false;
//                }
//
//                return true;
//            }
//        }
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof Shirt;
//    }
//
//    public int hashCode() {
//        boolean PRIME = true;
//        int result = 1;
//        result = result * 59 + this.getId();
//        result = result * 59 + this.getAvailable();
//        Object $name = this.getName();
//        result = result * 59 + ($name == null ? 43 : $name.hashCode());
//        Object $description = this.getDescription();
//        result = result * 59 + ($description == null ? 43 : $description.hashCode());
//        Object $img = this.getImg();
//        result = result * 59 + ($img == null ? 43 : $img.hashCode());
//        return result;
//    }
//
//    public String toString() {
//        return "Shirt(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", available=" + this.getAvailable() + ", img=" + this.getImg() + ")";
//    }
//
//    public Shirt(final int id, final String name, final String description, final int available, final String img) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.available = available;
//        this.img = img;
//    }
//
//    public Shirt() {
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public String getDescription() {
//        return this.description;
//    }
//
//    public int getAvailable() {
//        return this.available;
//    }
//
//    public String getImg() {
//        return this.img;
//    }
//
//    public void setId(final int id) {
//        this.id = id;
//    }
//
//    public void setName(final String name) {
//        this.name = name;
//    }
//
//    public void setDescription(final String description) {
//        this.description = description;
//    }
//
//    public void setAvailable(final int available) {
//        this.available = available;
//    }
//
//    public void setImg(final String img) {
//        this.img = img;
//    }
//}
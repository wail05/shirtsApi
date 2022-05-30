package com.example.apishirt.dto;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShirtDTO {
    private int id;
    private String name;
    private String description;
    private int available;

}

//public class ShirtDTO {
//    private int id;
//    private String name;
//    private String description;
//    private int available;
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
//    public boolean equals(final Object o) {
//        if (o == this) {
//            return true;
//        } else if (!(o instanceof ShirtDTO)) {
//            return false;
//        } else {
//            ShirtDTO other = (ShirtDTO)o;
//            if (!other.canEqual(this)) {
//                return false;
//            } else if (this.getId() != other.getId()) {
//                return false;
//            } else if (this.getAvailable() != other.getAvailable()) {
//                return false;
//            } else {
//                label40: {
//                    Object this$name = this.getName();
//                    Object other$name = other.getName();
//                    if (this$name == null) {
//                        if (other$name == null) {
//                            break label40;
//                        }
//                    } else if (this$name.equals(other$name)) {
//                        break label40;
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
//                return true;
//            }
//        }
//    }
//
//    protected boolean canEqual(final Object other) {
//        return other instanceof ShirtDTO;
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
//        return result;
//    }
//
//    public String toString() {
//        return "ShirtDTO(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", available=" + this.getAvailable() + ")";
//    }
//
//    public ShirtDTO() {
//    }
//
//    public ShirtDTO(final int id, final String name, final String description, final int available) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.available = available;
//    }
//}

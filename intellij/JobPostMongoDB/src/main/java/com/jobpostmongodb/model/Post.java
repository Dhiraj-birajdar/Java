package com.jobpostmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Post {

    @Id
    private String id;
    private String profile;
    private String desc;
    private int exp;
    private String techStack[];

    public Post() {
    }

    Post(String id, String profile, String desc, int exp, String[] techStack) {
        this.id = id;
        this.profile = profile;
        this.desc = desc;
        this.exp = exp;
        this.techStack = techStack;
    }

    public static PostBuilder builder() {
        return new PostBuilder();
    }

    public String getId() {
        return this.id;
    }

    public String getProfile() {
        return this.profile;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getExp() {
        return this.exp;
    }

    public String[] getTechStack() {
        return this.techStack;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setTechStack(String[] techStack) {
        this.techStack = techStack;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Post)) return false;
        final Post other = (Post) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$profile = this.getProfile();
        final Object other$profile = other.getProfile();
        if (this$profile == null ? other$profile != null : !this$profile.equals(other$profile)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        if (this.getExp() != other.getExp()) return false;
        if (!java.util.Arrays.deepEquals(this.getTechStack(), other.getTechStack())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Post;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $profile = this.getProfile();
        result = result * PRIME + ($profile == null ? 43 : $profile.hashCode());
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        result = result * PRIME + this.getExp();
        result = result * PRIME + java.util.Arrays.deepHashCode(this.getTechStack());
        return result;
    }

    public String toString() {
        return "Post(id=" + this.getId() + ", profile=" + this.getProfile() + ", desc=" + this.getDesc() + ", exp=" + this.getExp() + ", techStack=" + java.util.Arrays.deepToString(this.getTechStack()) + ")";
    }

    public static class PostBuilder {
        private String id;
        private String profile;
        private String desc;
        private int exp;
        private String[] techStack;

        PostBuilder() {
        }

        public PostBuilder id(String id) {
            this.id = id;
            return this;
        }

        public PostBuilder profile(String profile) {
            this.profile = profile;
            return this;
        }

        public PostBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public PostBuilder exp(int exp) {
            this.exp = exp;
            return this;
        }

        public PostBuilder techStack(String[] techStack) {
            this.techStack = techStack;
            return this;
        }

        public Post build() {
            return new Post(this.id, this.profile, this.desc, this.exp, this.techStack);
        }

        public String toString() {
            return "Post.PostBuilder(id=" + this.id + ", profile=" + this.profile + ", desc=" + this.desc + ", exp=" + this.exp + ", techStack=" + java.util.Arrays.deepToString(this.techStack) + ")";
        }
    }
}

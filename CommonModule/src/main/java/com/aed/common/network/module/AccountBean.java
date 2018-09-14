package com.aed.common.network.module;

import java.io.Serializable;

public class AccountBean implements Serializable {

    /**
     * errorCode : 0
     * errorMsg : OK!
     * data : {"userId":"70633005344106041008","level":1,"dollar":0,"name":"诗和远方","headImage":"http://thirdwx.qlogo.cn/mmopen/vi_32/w6BtlmSPr7aCsrmQG1kDTibnv5jds66BthXZhByO4xwtTM1tnAxSkgIpch9kZtLAWkC7bzc2NiaHdVCC6DWFtPRg/132","description":"","city":"","school":"","introduction":"","introImages":"","club":false,"official":false,"mentor":false,"status":"UN_CERTIFICATED","receiveUnFollowedPM":true,"clubCount":0,"memberCount":0,"followedCount":1,"followerCount":0,"join":false,"follow":false,"followed":false,"unReadNotificationCount":0,"unAuditCount":0,"orderNum":{"NEED_RECEIVE":0,"NEED_SHIP":0,"NEED_PAY":0}}
     * ok : true
     */

    private int errorCode;
    private String errorMsg;
    private DataBean data;
    private boolean ok;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public static class DataBean implements Serializable{
        /**
         * userId : 70633005344106041008
         * level : 1
         * dollar : 0
         * name : 诗和远方
         * headImage : http://thirdwx.qlogo.cn/mmopen/vi_32/w6BtlmSPr7aCsrmQG1kDTibnv5jds66BthXZhByO4xwtTM1tnAxSkgIpch9kZtLAWkC7bzc2NiaHdVCC6DWFtPRg/132
         * description :
         * city :
         * school :
         * introduction :
         * introImages :
         * club : false
         * official : false
         * mentor : false
         * status : UN_CERTIFICATED
         * receiveUnFollowedPM : true
         * clubCount : 0
         * memberCount : 0
         * followedCount : 1
         * followerCount : 0
         * join : false
         * follow : false
         * followed : false
         * unReadNotificationCount : 0
         * unAuditCount : 0
         * orderNum : {"NEED_RECEIVE":0,"NEED_SHIP":0,"NEED_PAY":0}
         */

        private String userId;
        private int level;
        private int dollar;
        private String name;
        private String headImage;
        private String description;
        private String city;
        private String school;
        private String introduction;
        private String introImages;
        private boolean club;
        private boolean official;
        private boolean mentor;
        private String status;
        private boolean receiveUnFollowedPM;
        private int clubCount;
        private int memberCount;
        private int followedCount;
        private int followerCount;
        private boolean join;
        private boolean follow;
        private boolean followed;
        private int unReadNotificationCount;
        private int unAuditCount;
        private OrderNumBean orderNum;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getDollar() {
            return dollar;
        }

        public void setDollar(int dollar) {
            this.dollar = dollar;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeadImage() {
            return headImage;
        }

        public void setHeadImage(String headImage) {
            this.headImage = headImage;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getIntroImages() {
            return introImages;
        }

        public void setIntroImages(String introImages) {
            this.introImages = introImages;
        }

        public boolean isClub() {
            return club;
        }

        public void setClub(boolean club) {
            this.club = club;
        }

        public boolean isOfficial() {
            return official;
        }

        public void setOfficial(boolean official) {
            this.official = official;
        }

        public boolean isMentor() {
            return mentor;
        }

        public void setMentor(boolean mentor) {
            this.mentor = mentor;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isReceiveUnFollowedPM() {
            return receiveUnFollowedPM;
        }

        public void setReceiveUnFollowedPM(boolean receiveUnFollowedPM) {
            this.receiveUnFollowedPM = receiveUnFollowedPM;
        }

        public int getClubCount() {
            return clubCount;
        }

        public void setClubCount(int clubCount) {
            this.clubCount = clubCount;
        }

        public int getMemberCount() {
            return memberCount;
        }

        public void setMemberCount(int memberCount) {
            this.memberCount = memberCount;
        }

        public int getFollowedCount() {
            return followedCount;
        }

        public void setFollowedCount(int followedCount) {
            this.followedCount = followedCount;
        }

        public int getFollowerCount() {
            return followerCount;
        }

        public void setFollowerCount(int followerCount) {
            this.followerCount = followerCount;
        }

        public boolean isJoin() {
            return join;
        }

        public void setJoin(boolean join) {
            this.join = join;
        }

        public boolean isFollow() {
            return follow;
        }

        public void setFollow(boolean follow) {
            this.follow = follow;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public int getUnReadNotificationCount() {
            return unReadNotificationCount;
        }

        public void setUnReadNotificationCount(int unReadNotificationCount) {
            this.unReadNotificationCount = unReadNotificationCount;
        }

        public int getUnAuditCount() {
            return unAuditCount;
        }

        public void setUnAuditCount(int unAuditCount) {
            this.unAuditCount = unAuditCount;
        }

        public OrderNumBean getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(OrderNumBean orderNum) {
            this.orderNum = orderNum;
        }

        public static class OrderNumBean implements Serializable{
            /**
             * NEED_RECEIVE : 0
             * NEED_SHIP : 0
             * NEED_PAY : 0
             */

            private int NEED_RECEIVE;
            private int NEED_SHIP;
            private int NEED_PAY;

            public int getNEED_RECEIVE() {
                return NEED_RECEIVE;
            }

            public void setNEED_RECEIVE(int NEED_RECEIVE) {
                this.NEED_RECEIVE = NEED_RECEIVE;
            }

            public int getNEED_SHIP() {
                return NEED_SHIP;
            }

            public void setNEED_SHIP(int NEED_SHIP) {
                this.NEED_SHIP = NEED_SHIP;
            }

            public int getNEED_PAY() {
                return NEED_PAY;
            }

            public void setNEED_PAY(int NEED_PAY) {
                this.NEED_PAY = NEED_PAY;
            }
        }
    }
}

class Twitter {

    private static int timestamp=0;              
    private Map<Integer , User> map ;                       
    
    
    class Tweet{
        int tweetId;
        int time;
        public Tweet next;

        public Tweet(int tweetId ){
            this.tweetId =tweetId;
            this.time= timestamp;
            timestamp+=1;
        }
    }

    class User{
        int userId;
        Set<Integer> followed;
        Tweet t_head ;

        public User(int userId){
            this.userId = userId;
            this.followed= new HashSet<>();
            follow(userId);
            t_head=null;
        }

        public void follow(int id){
            followed.add(id);
        }

        public void unfollow(int id){
            followed.remove(id);
        }

        public void post(int id){
            Tweet t = new Tweet(id);
            t.next=t_head;
            t_head=t;
        }
    }
    
    
    public Twitter() {
        map = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!map.containsKey(userId)){
            User u = new User(userId);
            map.put(userId , u);
        }
        map.get(userId).post(tweetId);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> l= new ArrayList<>();
        
        if(!map.containsKey(userId)) return l;
        
        Set<Integer> set = map.get(userId).followed;
        
        //min heap-> 10 largest timeStamp right?
        
        PriorityQueue<Tweet> pq = new PriorityQueue<>(set.size() , (a,b)-> b.time - a.time);
        
        //as user follows itself as well 
        
        for(int i :set) addTweetHeadFollowed(map.get(i), pq);
        
        int n=0;
        while(n<10 && !pq.isEmpty()){
            Tweet t = pq.poll();
            l.add(t.tweetId);
            n+=1;
            
            if(t.next!=null) pq.add(t.next);
        } 
        return l;
    }
    
    public void addTweetHeadFollowed(User u, PriorityQueue<Tweet> pq ){
        Tweet temp= u.t_head;
        if(temp!=null) pq.offer(temp);
    }
    
    public void follow(int followerId, int followeeId) {
        if(!map.containsKey(followeeId)) {
            User u= new User(followeeId);
            map.put(followeeId, u);   
        }
        if(!map.containsKey(followerId)) {
            User u= new User(followerId);
            map.put(followerId, u);   
        }
        map.get(followerId).follow(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!map.containsKey(followerId) || followerId == followeeId) return ;
            
        map.get(followerId).unfollow(followeeId);
    }
}


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
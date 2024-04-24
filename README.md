# oodParkingCode
<img width="1022" alt="截屏2024-04-24 21 58 21" src="https://github.com/xkong-study/oodDesignParking/assets/100473178/4b8b950b-46fe-4fdc-9801-a5442a560358">

需求：        
1. 我们要支持主要功能，进停车场停车，出停车场              
2．停车位本身有大小之分，可以有不同类型的停车位，比如摩托车，残疾人专用停车位，小汽车，大卡车            
3. 能停多少车需要统计，不能超过capacity   
4. 停车场应该有很多层来停车      
5. 每一层可以有多个不同的出入口，（检票处仍然是只有一个地方几个站)          
6. 目前停车位的显示屏monitoring，来告诉用户哪里空着位置，也方便admin来做管理，更智能我们可以根据用户位置自动推荐最近的停车位        
7．收费系统每小时多少钱，或者阶梯定价        
8. 收费可以用现金或者信用卡


Object：     

ParkingLot      
ParkingSpot      
ParkingTicket

 
ParkingLot:应管理所有的停车位并处理停车场的总体运作            
  
field:         
管理停车位的集合（如 List<ParkingSpot> 或 Map<String, ParkingSpot>）
管理活跃停车票的集合（如 List<ParkingTicket> 或 Map<String, ParkingTicket>）


method:       
添加/移除停车位的方法        
停车方法（生成一个 ParkingTicket）       
取车方法（用 ParkingTicket 来计算费用）        
检查可用的停车位        

ParkingSpot:应包含关于个别停车位的信息     

field:      
parkingLocation：停车位位置     
hourlyRatio：停车价格       

method:  
停车        
退出     

 
ParkingTicket(算费用，记录时间，根据车位类型展示不同的价格)。     

field:     
ticketID：停车票的唯一标识符        
startTime：车辆停放的开始时间      
endTime：车辆离开的时间（用于计算停放时长）    
rate：每小时的收费率    

method:    
根据停放时长和停车位类型计算费用的方法   
打印或显示停车票信息的方法         


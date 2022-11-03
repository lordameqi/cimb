import { Component } from "react";

function Content(){
return(
    <div>
          <div className="content" style={{margin: "10px",height: "240px"}}>
                <img alt='huy' style={{height: "220px", width: "220px",float:"left"}} src='https://embed.pixiv.net/decorate.php?illust_id=76285759'></img>
                <div style={{float: "right",marginRight:"500px"}}>
                <h3 style={{paddingRight: "200px"}}><b>Hacktiv8 Meetup</b></h3>
                <table  style={{width: "360px"}}>
                    <tr>
                        <td style={{textAlign:"left"}}>Location</td>
                        <td style={{textAlign:"left"}}>Jakarta, Indonesia</td>
                    </tr>
                    <tr>
                        <td style={{textAlign:"left"}}>Members</td>
                        <td style={{textAlign:"left"}}>1,078</td>
                    </tr>
                    <tr>
                        <td style={{textAlign:"left"}}>Organizers</td>
                        <td style={{textAlign:"left"}}>Adhy Wiranata</td>
                    </tr>
                </table>
                </div>
                
            </div>
            <div style={{paddingLeft:"20px"}}>
                <h2 style={{textAlign:"left"}}>Next Meetup</h2>
            </div>
            <div className="content" style={{margin: "2px 40px",height: "240px"}}>
                <h3 style={{textAlign:"left"}}>Awesome meetup and event</h3>
                <p style={{color:"GrayText",textAlign:"left"}}>25 January 2019</p>
                <p style={{textAlign:"left"}}>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Arcu dictum varius duis at consectetur lorem donec massa. Elit eget gravida cum sociis natoque penatibus et magnis dis. Lacinia quis vel eros donec ac. Nullam vehicula ipsum a arcu cursus vitae congue mauris. Aliquet eget sit amet tellus. Tincidunt nunc pulvinar sapien et. Odio morbi quis commodo odio aenean sed adipiscing. Imperdiet massa tincidunt nunc pulvinar. Nibh mauris cursus mattis molestie a iaculis at erat. Cursus metus aliquam eleifend mi. Nec ultrices dui sapien eget mi proin. Vel risus commodo viverra maecenas accumsan lacus vel. Aliquet enim tortor at auctor urna nunc id cursus. In mollis nunc sed id semper risus in.</p>
            
            </div>
            <div style={{paddingLeft:"20px"}}>
                <h2 style={{textAlign:"left"}}>About Meetup</h2>
            </div>
            <div className="content" style={{margin: "2px 40px",height: "100px",backgroundColor:"white"}}>
                <p style={{textAlign:"left"}}>COme and meet others developer interested in the javascript and its library in the Greater Jakarta area. <br/><br/>Twitter @JakartaJS and we use the hastag #jakartaJS</p>
            </div>
            <div style={{paddingLeft:"20px",marginTop:"40px"}}>
                <h2 style={{float:"left",textAlign:"left"}}>Members</h2>
                <b style={{float:"right",marginRight:"10px"}}>See all</b>
            </div>
            <div className="content" style={{marginTop:"130px",margin: "2px 40px",height: "140px"}}>
            <img alt='huy' style={{borderRadius:"80%",height: "120px", width: "120px",float:"left"}} src='https://embed.pixiv.net/decorate.php?illust_id=76285759'></img>
                <div style={{float: "right",marginRight:"600px"}}>
                <h3 style={{paddingRight: "250px"}}><b>Organizers</b></h3>
                <table  style={{width: "360px"}}>
                    <tr>
                        <td style={{textAlign:"left"}}>Adhy Wiranata</td>
                        <td style={{textAlign:"left"}}>4 others</td>
                    </tr>
                </table>
                </div>
            </div>
            <br/>
            <div style={{paddingLeft:"20px",marginTop:"70px"}}>
                <h2 style={{float:"left",textAlign:"left"}}>Past Meetup</h2>
                <b style={{float:"right",marginRight:"10px"}}>See all</b>
            </div>
            <div className="content" style={{marginTop:"160px",margin: "2px 40px",height: "240px",backgroundColor:"white"}}>
            
            <div style={{float:"left",width:"200px",height:"200px",backgroundColor:"green"}}>
                <p style={{textAlign:"left"}}><b>27 November 2017</b></p>
                <hr/>
                <p  style={{textAlign:"left"}}><b>#39 Jakarta JIS</b></p>
             
                <p  style={{textAlign:"left"}}><b>139</b><span style={{color:"grey"}}> went</span></p>
                <button style={{marginRight:"140px"}}>View</button>
            </div>

            <div style={{float:"right",width:"200px",height:"200px",backgroundColor:"green"}}>
                <p style={{textAlign:"left"}}><b>27 November 2017</b></p>
                <hr/>
                <p  style={{textAlign:"left"}}><b>#39 Jakarta JIS</b></p>
             
                <p  style={{textAlign:"left"}}><b>139</b><span style={{color:"grey"}}> went</span></p>
                <button style={{marginRight:"140px"}}>View</button>
            </div>

            <div style={{marginLeft:"230px",float:"left",width:"200px",height:"200px",backgroundColor:"green"}}>
                <p style={{textAlign:"left"}}><b>27 November 2017</b></p>
                <hr/>
                <p  style={{textAlign:"left"}}><b>#39 Jakarta JIS</b></p>
             
                <p  style={{textAlign:"left"}}><b>139</b><span style={{color:"grey"}}> went</span></p>
                <button style={{marginRight:"140px"}}>View</button>
            </div>
 
            </div>
    </div>
)
}

export default Content;
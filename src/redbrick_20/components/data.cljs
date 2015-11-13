(ns redbrick-20.components.data
    (:require [reagent.core :as reagent]))

(def supporting-deails (reagent/atom {
    :title "Time To Have a Birthday Party!"
    :text "Hear ye! Hear ye! Let the calls of \"RESIIIGN\" toll through the lands, for
          today is a day of celebration! The twentieth anniversary of the honourable
          Redbrick society has arrived! Over the past twenty years, DCU's Networking
          Society has been through a lot, and now is the time to remember, and to
          party! Meet the Redbrick heroes and villains from over the years, and
          party with the current networking stock; share horror stories, and make
          fun of the admins who broke everything with the best of them. So dust off
          your networking goggles, and get ready to see regrettable drunk pictures
          from the past 20 years! See you on the 9th April 2016, to eat, drink, be
          merry, and party like it's 1996!"
  }))

(def event-details (reagent/atom {
  :event-title "Event Details"
  :maps-location "TODO"
  :event-location "TBA"
  :event-date "9th of April"
  :event-information "TBA"}))


(def timeline [
  {
    :year 1996
    :supporting-data "In October of 1995 a group of friends started the ball rolling on the idea of a computer network in DCU,
    run by students for the students. Starting out with a battered 386 PC with 8 MB of RAM(dubbed Nurse), bits of borrowed memory,
    their own cash, and a lot of luck, they went about organising the D.C.U Networking society. The initial build of the Nurse was
    performed on an 800MB hard drive (the first RB disk) in DrJolt's home computer on February 4th, 1996. Once recognised as a
    society, they were allowed to setup a temporary home for the server in the Computer Applications facility, going online in the
    postgrad area on March 5th, 1996 as dcuns.compapp.dcu.ie. Later, the society received its own subnet and subdomain of dcu.ie
    from the Computer Services Department."
    :supporting-image "http://www.pixempire.com/images/preview/power-on-computer-icon.jpg"
  }
  {
    :year 1997
    :supporting-data "Valentines' Event in The Fleet (Shift a Trinner?).
                      Heres a picture of pooka have fun"
    :supporting-image "http://www.redbrick.dcu.ie/~wibble/party/pooka.jpg"
  }
  {
    :year 1998
    :supporting-data "Redbrick's machine \"mother\" goes live. Redbrick members are finally allowed to have
                      multiple accounts"
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 1999
    :supporting-data "IRC server is set up on redbrick, replacing ITCHY NUTS.
                      Grimnar made his committee and admin mail publically readable making it
                      possible for people to read other member's passwords and committee business. \n
                      Associate membership introduced with CSD's consent.
                      Redbrick's new machine, Enigma, running FreeBSD is launched"
    :supporting-image "https://raw.githubusercontent.com/factor-io/connector-irc/master/logo.png"
  }
  {
    :year 2000
    :supporting-data "Rag Week. Redbrick, the SU, and some other people (mostly redbrick though ;o))
                      turned out on a _very_ cold Monday morning to collect for the Irish Cancer Society on
                      the Ballymun and Swords Roads (at the junctions with Collins Avenue). Then they did
                      the same again in the day at rush hour. Redbrick also had a bouncy castle in DCU.
                      In association with Trad Soc we had an event in Whelans.
                      Trad soc, Jilted, Relish, Tea & Sympathy (American band) all played great sets."
    :supporting-image "http://blogs.exeter.ac.uk/librarynews/files/2013/03/RAG-Logo-Final1.png"
  }
  {
    :year 2001
    :supporting-data "Shadow starts his posting logs now that nntp-cache shows the
                      username of the person that posted in the headers. Dax.redbrick.dcu.is
                      is setup as a machine for use by CTYI.
                      Redbrick begins weekly tutorials in LG25 of the CA Building. The first two
                      tutorials are about writing webpages in HTML and using FTP to upload them to
                      redbrick. The third tutorial showed people how to setup Windowmaker and KDE
                      on their Solaris accounts in CA, as well as giving a basic introduction to commandline UNIX. "
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2002
    :supporting-data "This entire wiki section just seems like bloat nothing of real society relevance happens or at least that
                      is what I've gathered from this."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2003
    :supporting-data "Redbrick gets donated two Alpha servers. One from HEAnet and the other from DCU CSD.
                      Redbricks new server goes live and is named Deathray. The name is from a joke about
                      dimples using Redbrick's money to finance a death ray. or something.
                      Deathray becomes the primary login server, all logins now accepted at login.redbrick.dcu.ie, redbrick.dcu.ie is no more. "
    :supporting-image "http://heanet.ie/wordpress/wp-content/uploads/2014/10/HEAnet-Logo-2011-blue_text-white_back-Large.png"
  }
  {
    :year 2004
    :supporting-data "Services are gradually moved off prodigy and onto deathray.
                      Dcu.ie went down due to a serious hardware failure and perhaps
                      because people were constantly hitting the refresh key in the
                      hope that results would be released a day early. "
    :supporting-image "http://www.maturestudents.ie/img/institutionlogos/dcu.jpg"
  }
  {
    :year 2005
    :supporting-data "There is literally nothing of relevance on the wiki for this year :(."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2006
    :supporting-data "The Redbrick Wiki was defaced by spammers. The wiki was temporarily taken down.
                      Redbrick celebrates its 10th birthday party in Bojangles nightclub, Harcourt st. "
    :supporting-image "http://cnet4.cbsistatic.com/hub/i/2013/09/09/f927f411-6de9-11e3-913e-14feb5ca9861/0aeb55bb016f3b71f68e52959b1403fc/LulzSecLogo.png"
  }
  {
    :year 2007
    :supporting-data "MOTD was changed to say that due to someone running torrents from /var/tmp/ that
                      Redbrick has to shut down. Some brickies are just stupid and fell for it!
                      The new Encom server goes through about a dozen names, before finally settling on
                      minerva.redbrick.dcu.ie, which apparently is \"horribly lame\".
                      /webtree is moved to minerva. No one notices, or is told. "
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2008
    :supporting-data "Redbrick wins Best Website at the Clubs and Socs Awards, which were
                      held in the Helix on Thursday 10th of April. Redbrick Chairperson Andrew Harford wins
                      a First Five award for Best Individual.
                      Redbrick wins Best Society Website of a Large College at the BICS Awards in Dundalk - Best Website in Ireland!"
    :supporting-image "http://psdfinder.com/wp-content/uploads/trophy-icon1.jpg"
  }
  {
    :year 2009
    :supporting-data "RedBrick Twitter is launched to tell people about stuff.
                      DCUfm forget to renew their license. RedBrick pull the stream
                      for legal reasons."
    :supporting-image "https://g.twimg.com/Twitter_logo_blue.png"
  }
  {
    :year 2010
    :supporting-data "Servers are taken offline to prepare for the move to our new server room. Minerva, Morpheus
                      and Worf are moved to ISS's server room in the library to maintain services during the downtime.
                      The brick is \"accidentally\" destroyed in the process. Meeting room 3 becomes Redbrick storage."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2011
    :supporting-data "Redbrick's new login server Azazel is opened to members for testing.
                      Redbrick updates from its old logo to its newest iteration.
                      Redbrick launches its new Web-boards @ boards.redbrick.dcu.ie.
                      Redbrick holds an Introduction to Python talk. It is recorded by a member of MPS, making it the first recent Redbrick talk to have been recorded. "
    :supporting-image "https://pbs.twimg.com/profile_images/1662456750/logo_400x400.png"
  }
  {
    :year 2012
    :supporting-data "Redbrick go to FOSDEM, valuable lessions on Mutliple campuses and tee-shirts in winter
                      were learned. Redbrick takes applications for this years IrlCPC Programming Competition in UCC.
                      Five teams are formed to attend the event. Redbrick member bunbun passed away"
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2013
    :supporting-data "The year space forgot the space #NeverForget :("
    :supporting-image "http://www.redbrick.dcu.ie/includes/images/logo.png"
  }
  {
    :year 2014
    :supporting-data "Redbrick relaunched TechWeek with the support of companys like Google & Amazon.
                      We Join Google at the first Google Open day in their Dublin Ireland Office"
    :supporting-image "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/Google_2015_logo.svg/1000px-Google_2015_logo.svg.png"
  }
  {
    :year 2015
    :supporting-data "Redbrick Returns to FOSDEM there was cheers, tears and far far too many beer's.
                      The admins realized Redbrick isnt as reziliant as once thought. Rob didnt resgin!
                      TechWeek is held in the mezz, We got Speakers from AOL, Intercom, Google, Amazon and our lovely Associates :)"
    :supporting-image "https://pbs.twimg.com/profile_images/378800000547772739/6069389b75cc1ae0d2ab8a0ebac9bec8_400x400.png"
  }
  ])

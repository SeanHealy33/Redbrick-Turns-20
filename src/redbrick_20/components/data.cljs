(ns redbrick-20.components.data
    (:require [reagent.core :as reagent]))

(def supporting-deails (reagent/atom {
    :title "Time To Have a Birthday Party!"
    :text "This year marks our 20th birthday. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
    tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
    nisi ut aliquip ex ea commodo consequat.
    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
    occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
  }))

(def event-details (reagent/atom {
  :event-title "Event Details"
  :maps-location "asdfghj"
  :event-location "TBA"
  :event-date "TBA"
  :event-information "TBA"}))


(def timeline (reagent/atom [
  {
    :year 1996
    :supporting-data "In October of 1995 a group of friends started the ball rolling on the idea of a computer network in DCU,
    run by students for the students. Starting out with a battered 386 PC with 8 MB of RAM(dubbed Nurse), bits of borrowed memory,
    their own cash, and a lot of luck, they went about organising the D.C.U Networking society. The initial build of the Nurse was
    performed on an 800MB hard drive (the first RB disk) in DrJolt's home computer on February 4th, 1996. Once recognised as a
    society, they were allowed to setup a temporary home for the server in the Computer Applications facility, going online in the
    postgrad area on March 5th, 1996 as dcuns.compapp.dcu.ie. Later, the society received its own subnet and subdomain of dcu.ie
    from the Computer Services Department."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 1997
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 1998
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 1999
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2000
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2001
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2002
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2003
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2004
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2005
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2006
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2007
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2008
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2009
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2010
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2011
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "https://pbs.twimg.com/profile_images/1662456750/logo_400x400.png"
  }
  {
    :year 2012
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2013
    :supporting-data "The year space forgot the space #NeverForget :("
    :supporting-image "http://www.redbrick.dcu.ie/includes/images/logo.png"
  }
  {
    :year 2014
    :supporting-data "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris
nisi ut aliquip ex ea commodo consequat."
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  {
    :year 2015
    :supporting-data "Hello world"
    :supporting-image "http://wiki.redbrick.dcu.ie/mw/images/2/29/Rbwiki_RedbrickLogo_logo2-rb.gif"
  }
  ]))

package tc.oc.pgm.modules;

import java.util.logging.Logger;

import org.jdom2.Document;
import org.jdom2.Element;
import tc.oc.pgm.map.MapModule;
import tc.oc.pgm.map.MapModuleContext;
import tc.oc.pgm.match.Match;
import tc.oc.pgm.match.MatchModuleFactory;
import tc.oc.pgm.module.ModuleDescription;

@ModuleDescription(name = "Discard Portion Bottles")
public class DiscardPotionBottlesModule implements MapModule, MatchModuleFactory<DiscardPotionBottlesMatchModule> {
    @Override
    public DiscardPotionBottlesMatchModule createMatchModule(Match match) {
        return new DiscardPotionBottlesMatchModule(match);
    }

    public static DiscardPotionBottlesModule parse(MapModuleContext context, Logger logger, Document doc) {
        Element el = doc.getRootElement().getChild("keep-potion-bottles");
        if(el == null) {
            return new DiscardPotionBottlesModule();
        }

        return null;
    }
}

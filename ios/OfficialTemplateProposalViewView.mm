#ifdef RCT_NEW_ARCH_ENABLED
#import "OfficialTemplateProposalViewView.h"

#import <react/renderer/components/RNOfficialTemplateProposalViewViewSpec/ComponentDescriptors.h>
#import <react/renderer/components/RNOfficialTemplateProposalViewViewSpec/EventEmitters.h>
#import <react/renderer/components/RNOfficialTemplateProposalViewViewSpec/Props.h>
#import <react/renderer/components/RNOfficialTemplateProposalViewViewSpec/RCTComponentViewHelpers.h>

#import "RCTFabricComponentsPlugins.h"
#import "Utils.h"

using namespace facebook::react;

@interface OfficialTemplateProposalViewView () <RCTOfficialTemplateProposalViewViewViewProtocol>

@end

@implementation OfficialTemplateProposalViewView {
    UIView * _view;
}

+ (ComponentDescriptorProvider)componentDescriptorProvider
{
    return concreteComponentDescriptorProvider<OfficialTemplateProposalViewViewComponentDescriptor>();
}

- (instancetype)initWithFrame:(CGRect)frame
{
  if (self = [super initWithFrame:frame]) {
    static const auto defaultProps = std::make_shared<const OfficialTemplateProposalViewViewProps>();
    _props = defaultProps;

    _view = [[UIView alloc] init];

    self.contentView = _view;
  }

  return self;
}

- (void)updateProps:(Props::Shared const &)props oldProps:(Props::Shared const &)oldProps
{
    const auto &oldViewProps = *std::static_pointer_cast<OfficialTemplateProposalViewViewProps const>(_props);
    const auto &newViewProps = *std::static_pointer_cast<OfficialTemplateProposalViewViewProps const>(props);

    if (oldViewProps.color != newViewProps.color) {
        NSString * colorToConvert = [[NSString alloc] initWithUTF8String: newViewProps.color.c_str()];
        [_view setBackgroundColor: [Utils hexStringToColor:colorToConvert]];
    }

    [super updateProps:props oldProps:oldProps];
}

Class<RCTComponentViewProtocol> OfficialTemplateProposalViewViewCls(void)
{
    return OfficialTemplateProposalViewView.class;
}

@end
#endif
